package org.mike.gitbranches;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Files.write(Paths.get("/home/levitsky/Документы/08092017/luk/pdotpr.base.bin"),
                Base64.getEncoder().encode(
                        Files.readAllBytes(Paths.get("/home/levitsky/Документы/08092017/luk/pdotpr.bin"))
                ));
    }
}
