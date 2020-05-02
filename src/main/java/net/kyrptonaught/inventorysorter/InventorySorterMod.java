package net.kyrptonaught.inventorysorter;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.kyrptonaught.inventorysorter.client.config.ConfigOptionss;
import net.kyrptonaught.inventorysorter.client.config.IgnoreList;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;


public class InventorySorterMod implements ModInitializer, ClientModInitializer {
    public static final String MOD_ID = "inventorysorter";
    private static final String KEY_BINDING_CATEGORY = "key.categories." + MOD_ID;
    public static FabricKeyBinding keyBinding;

    @Override
    public void onInitialize() {
        InventorySortPacket.registerReceivePacket();
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void onInitializeClient() {
        AutoConfig.register(ConfigOptionss.class, JanksonConfigSerializer::new);
        AutoConfig.register(IgnoreList.class, JanksonConfigSerializer::new);
        keyBinding = FabricKeyBinding.Builder.create(
                new Identifier(MOD_ID, "sort"),
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_P,
                KEY_BINDING_CATEGORY
        ).build();
        KeyBindingRegistry.INSTANCE.addCategory(KEY_BINDING_CATEGORY);
        KeyBindingRegistry.INSTANCE.register(keyBinding);
    }
    
    public static ConfigOptionss getConfig() {
        return AutoConfig.getConfigHolder(ConfigOptionss.class).getConfig();
    }
    
    public static IgnoreList getBlacklist() {
        return AutoConfig.getConfigHolder(IgnoreList.class).getConfig();
    }
}
