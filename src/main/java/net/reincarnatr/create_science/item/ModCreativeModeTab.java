package net.reincarnatr.create_science.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_SCIENCE = new CreativeModeTab("create_science_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PHASOMID.get());
        }
    };
}
