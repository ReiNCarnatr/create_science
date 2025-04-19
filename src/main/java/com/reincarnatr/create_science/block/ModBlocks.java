package com.reincarnatr.create_science.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.reincarnatr.create_science.CreateScience;
import com.reincarnatr.create_science.item.ModCreativeModeTab;
import com.reincarnatr.create_science.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateScience.MOD_ID);

    public static final RegistryObject<Block> PHASOMID_BLOCK = registerBlock("phasomid_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PHASOMID_RESONANT_BLOCK = registerBlock("phasomid_resonant_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(20f).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
