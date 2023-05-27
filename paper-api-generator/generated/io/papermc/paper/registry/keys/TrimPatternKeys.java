package io.papermc.paper.registry.keys;

import static net.kyori.adventure.key.Key.key;

import io.papermc.paper.generated.GeneratedFrom;
import io.papermc.paper.registry.TypedKey;
import net.kyori.adventure.key.Key;
import org.bukkit.inventory.meta.trim.TrimPattern;
import org.jetbrains.annotations.NotNull;

/**
 * Vanilla keys for {@link TrimPattern}.
 */
@SuppressWarnings({
        "unused",
        "SpellCheckingInspection"
})
@GeneratedFrom("1.20")
public final class TrimPatternKeys {
    /**
     * {@code minecraft:coast}
     */
    public static final TypedKey<TrimPattern> COAST = create(key("coast"));

    /**
     * {@code minecraft:dune}
     */
    public static final TypedKey<TrimPattern> DUNE = create(key("dune"));

    /**
     * {@code minecraft:eye}
     */
    public static final TypedKey<TrimPattern> EYE = create(key("eye"));

    /**
     * {@code minecraft:host}
     */
    public static final TypedKey<TrimPattern> HOST = create(key("host"));

    /**
     * {@code minecraft:raiser}
     */
    public static final TypedKey<TrimPattern> RAISER = create(key("raiser"));

    /**
     * {@code minecraft:rib}
     */
    public static final TypedKey<TrimPattern> RIB = create(key("rib"));

    /**
     * {@code minecraft:sentry}
     */
    public static final TypedKey<TrimPattern> SENTRY = create(key("sentry"));

    /**
     * {@code minecraft:shaper}
     */
    public static final TypedKey<TrimPattern> SHAPER = create(key("shaper"));

    /**
     * {@code minecraft:silence}
     */
    public static final TypedKey<TrimPattern> SILENCE = create(key("silence"));

    /**
     * {@code minecraft:snout}
     */
    public static final TypedKey<TrimPattern> SNOUT = create(key("snout"));

    /**
     * {@code minecraft:spire}
     */
    public static final TypedKey<TrimPattern> SPIRE = create(key("spire"));

    /**
     * {@code minecraft:tide}
     */
    public static final TypedKey<TrimPattern> TIDE = create(key("tide"));

    /**
     * {@code minecraft:vex}
     */
    public static final TypedKey<TrimPattern> VEX = create(key("vex"));

    /**
     * {@code minecraft:ward}
     */
    public static final TypedKey<TrimPattern> WARD = create(key("ward"));

    /**
     * {@code minecraft:wayfinder}
     */
    public static final TypedKey<TrimPattern> WAYFINDER = create(key("wayfinder"));

    /**
     * {@code minecraft:wild}
     */
    public static final TypedKey<TrimPattern> WILD = create(key("wild"));

    private TrimPatternKeys() {
    }

    /**
     * Creates a key for {@link TrimPattern} in a registry.
     *
     * @param key the value's key in the registry
     * @return a new typed key
     */
    public static @NotNull TypedKey<TrimPattern> create(final @NotNull Key key) {
        return TypedKey.create(key, null);
    }
}
