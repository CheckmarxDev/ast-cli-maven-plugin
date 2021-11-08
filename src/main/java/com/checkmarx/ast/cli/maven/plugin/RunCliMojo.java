package com.checkmarx.ast.cli.maven.plugin;

import com.checkmarx.ast.wrapper.CxException;
import com.checkmarx.ast.wrapper.CxThinWrapper;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.IOException;

@Mojo(name = "run")
public class RunCliMojo extends AbstractMojo {

    @Parameter(property = "arguments")
    private String arguments;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (arguments == null || arguments.equals("")) {
            throw new MojoExecutionException("no arguments provided");
        }
        try {
            new CxThinWrapper().run(arguments);
        } catch (IOException | InterruptedException e) {
            throw new MojoExecutionException(e.getMessage(), e);
        } catch (CxException e) {
            throw new MojoFailureException(e.getMessage(), e);
        }
    }
}
