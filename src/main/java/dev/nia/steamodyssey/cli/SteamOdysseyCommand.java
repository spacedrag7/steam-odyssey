package dev.nia.steamodyssey.cli;

import picocli.CommandLine.Command;

@Command(
        name = "steam-odyssey",
        mixinStandardHelpOptions = true,
        version = "Steam Odyssey 0.1.0",
        description = "A beautiful CLI to explore your Steam library :3"
)

public class SteamOdysseyCommand implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Steam Odyssey v0.1.0");
        System.out.println();
        System.out.println("Welcome aboard, Captain.");
        System.out.println();
        System.out.println("Type --help to see available commands.");
    }
}
