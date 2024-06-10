package dev.morazzer.cookies.mod.features.farming;

import dev.morazzer.cookies.mod.features.Loader;
import dev.morazzer.cookies.mod.features.farming.jacob.HighlightUnclaimedJacobsContest;

/**
 * Utility class to load all farming related features.
 */
@SuppressWarnings("MissingJavadoc")
public class FarmingFeatures {
    public void load() {
        Loader.load("HighlightUnclaimedJacobContest", HighlightUnclaimedJacobsContest::load);
    }
}
