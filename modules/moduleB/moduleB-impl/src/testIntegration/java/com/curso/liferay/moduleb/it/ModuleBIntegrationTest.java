package com.curso.liferay.moduleb.it;

import com.curso.liferay.moduleb.api.ModuleB;
import com.google.common.io.Files;
import com.liferay.arquillian.containter.remote.enricher.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Arquillian.class)
public class ModuleBIntegrationTest {

    @Deployment
    public static JavaArchive create() throws Exception {
        final File tempDir = Files.createTempDir();

        String gradlew = "../../../gradlew";

        String osName = System.getProperty("os.name", "");
        if (osName.toLowerCase().contains("windows")) {
            gradlew = "../../../gradlew.bat";
        }

        final ProcessBuilder processBuilder = new ProcessBuilder(
                gradlew, "jar", "-Pdir=" + tempDir.getAbsolutePath());

        final Process process = processBuilder.start();

        process.waitFor();

        final File jarFile = new File(
                tempDir.getAbsolutePath() +
                        "/com.curso.liferay.moduleb.impl-1.0.0.jar");

        return ShrinkWrap.createFromZipFile(JavaArchive.class, jarFile);
    }

    @Test
    public void testing() {

        String expected = "aaa";
        String real = _moduleB.metodoEnModuleB();

        Assert.assertEquals(expected, real);
    }

    @Inject
    private ModuleB _moduleB;
}