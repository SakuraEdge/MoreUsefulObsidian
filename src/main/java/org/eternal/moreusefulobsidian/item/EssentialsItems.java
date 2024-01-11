package org.eternal.moreusefulobsidian.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.eternal.moreusefulobsidian.MoreUsefulObsidian;
import org.eternal.moreusefulobsidian.tab.ModCreativeModeTab;

public class EssentialsItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreUsefulObsidian.MODID);

    // 黑曜石核心
    public static final RegistryObject<Item> OBSIDIANCORE = ITEMS.register("core",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSIDIAN_TAB)));
    // 黑曜石棍
    public static final RegistryObject<Item> OBSIDIANSTICK = ITEMS.register("stick",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSIDIAN_TAB)));
    // 二重黑曜石棍
    public static final RegistryObject<Item> OBSIDIANDOUBLESTICK = ITEMS.register("double_stick",() -> new Item(new Item.Properties().tab(ModCreativeModeTab.OBSIDIAN_TAB)));

    // 黑曜石镐
    public static final RegistryObject<Item> OBSIDIANPICKAXE =
            ITEMS.register("obsidian_pickaxe",() -> new PickaxeItem(Tiers.NETHERITE,5,-2.4F,new Item.Properties().tab(ModCreativeModeTab.OBSIDIAN_TAB)));

    public static void register(IEventBus iEventBus){
        ITEMS.register(iEventBus);
    }

}
