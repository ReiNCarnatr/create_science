package com.reincarnatr.create_science.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.reincarnatr.create_science.CreateScience;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateScience.MOD_ID);

    public static final RegistryObject<Item> PHASOMID = ITEMS.register("phasomid_alloy",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHASOMID_RESONANT = ITEMS.register("phasomid_resonant_alloy",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
