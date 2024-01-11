package org.eternal.moreusefulobsidian.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.eternal.moreusefulobsidian.MoreUsefulObsidian;
import org.eternal.moreusefulobsidian.item.EssentialsItems;
import org.eternal.moreusefulobsidian.tab.ModCreativeModeTab;

import java.util.function.Supplier;


public class EssentialsBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreUsefulObsidian.MODID);

    public static final RegistryObject<Block> DOUBLE_OBSIDIAN_BLOCK =
            registerBlock("double_obsidian_block",()->new Block(BlockBehaviour.Properties.of(Material.STONE).strength(100f,100f).requiresCorrectToolForDrops()), ModCreativeModeTab.OBSIDIAN_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registryBlockItem(name,toReturn,tab);
        return toReturn;
    }

    public static <T extends Block>RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,CreativeModeTab tab){
        return EssentialsItems.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus iEventBus){
        BLOCKS.register(iEventBus);
    }

}
