package com.calypso.assembly;

import com.calypso.Past_PoetryLost_Era;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public final class ModScreenHandlers {
    public static final ScreenHandlerType<AssemblyScreenHandler> ASSEMBLY = Registry.register(
            Registries.SCREEN_HANDLER,
            new Identifier(Past_PoetryLost_Era.MOD_ID, "assembly"),
            new ScreenHandlerType<>(AssemblyScreenHandler::new, FeatureFlags.VANILLA_FEATURES)
    );

    private ModScreenHandlers() {
    }

    public static void register() {
    }
}
