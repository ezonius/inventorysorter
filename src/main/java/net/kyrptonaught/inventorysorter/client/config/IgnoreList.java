package net.kyrptonaught.inventorysorter.client.config;

import com.google.common.collect.ImmutableSet;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;
import net.minecraft.client.gui.screen.ingame.*;

import java.util.HashSet;

@Config(name = "blacklist")
public class IgnoreList implements ConfigData {
    @Comment("Inventories that should not be sorted")
    public HashSet<String> blacklistedInventories = new HashSet<>();

    public transient ImmutableSet<String> defaultBlacklist = ImmutableSet.of(
            BeaconScreen.class.getName(), AnvilScreen.class.getName(), EnchantmentScreen.class.getName(),
            GrindstoneScreen.class.getName(), AbstractFurnaceScreen.class.getName(), LoomScreen.class.getName(),
            CraftingScreen.class.getName(), BrewingStandScreen.class.getName(), MerchantScreen.class.getName(),
            InventoryScreen.class.getName(), CreativeInventoryScreen.class.getName(), HorseScreen.class.getName(),
            StonecutterScreen.class.getName(), SmokerScreen.class.getName(), BlastFurnaceScreen.class.getName(),
            FurnaceScreen.class.getName(),
            "com.github.briansemrau.cosmeticarmorslots.client.gui.screen.ingame.CosmeticArmorInventoryScreen",
            "me.marnic.extrabows.client.gui.BowUpgradeGui");
}
