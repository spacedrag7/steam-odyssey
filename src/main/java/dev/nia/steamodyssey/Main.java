package dev.nia.steamodyssey;

import dev.nia.steamodyssey.cli.SteamOdysseyCommand;
import picocli.CommandLine;

public class Main
{
    public static void main(String[] args)
    {
        int exitCode = new CommandLine(new SteamOdysseyCommand()).execute(args);
        System.exit(exitCode);
    }
}
