package net.Ttimy.C_Neqatics.item;

import net.Ttimy.C_Neqatics.CNequatics;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CNequatics.MOD_ID);

    public static final DeferredItem<Item> RAW_NEQUATIUM = ITEMS.register("raw_nequatium",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
