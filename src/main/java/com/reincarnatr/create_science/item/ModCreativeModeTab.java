package com.reincarnatr.create_science.item;

import com.reincarnatr.create_science.CreateScience;
import com.reincarnatr.create_science.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateScience.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_SCIENCE = CREATIVE_MODE_TABS.register("create_science_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PHASOMID.get()))
                    .title(Component.translatable("creativetab.create_science_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PHASOMID.get());
                        output.accept(ModItems.PHASOMID_RESONANT.get());
                        output.accept(ModBlocks.PHASOMID_BLOCK.get());
                        output.accept(ModBlocks.PHASOMID_RESONANT_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}