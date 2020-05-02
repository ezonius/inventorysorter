package net.kyrptonaught.inventorysorter.client.config;

import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;
import net.kyrptonaught.inventorysorter.SortCases;

@Config(name = "config")
public class ConfigOptionss implements me.sargunvohra.mcmods.autoconfig1u.ConfigData {
    
    @Comment("Enable 'Sort' button in inventorys")
    public boolean displaySort = true;
    @Comment("Middle click to sort inventorys")
    public boolean middleClick = true;
    @Comment("Enable second 'Sort' button in player inv")
    public boolean seperateBtn = true;
    @Comment("Sorting inv also sorts player inv")
    public boolean sortPlayer = false;
    @Comment("Method of sorting, NAME,CATEGORY,MOD")
    public SortCases.SortType sortType = SortCases.SortType.NAME;
    @Comment("Display Sort Button Tooltip")
    public boolean displayTooltip = true;
    
    public boolean debugMode = false;
    
}
