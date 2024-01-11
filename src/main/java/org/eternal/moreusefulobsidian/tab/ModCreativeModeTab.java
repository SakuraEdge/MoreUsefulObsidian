package org.eternal.moreusefulobsidian.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.eternal.moreusefulobsidian.item.EssentialsItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab OBSIDIAN_TAB = new CreativeModeTab("obsidiantab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(EssentialsItems.OBSIDIANCORE.get());
        }
    };
}
