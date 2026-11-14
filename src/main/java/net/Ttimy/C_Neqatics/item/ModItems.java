package net.Ttimy.C_Neqatics.item;

import net.Ttimy.C_Neqatics.CNequatics;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CNequatics.MOD_ID);

    public static final DeferredItem<Item> RAW_NEQUATIUM = ITEMS.register("raw_nequatium",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_INGOT = ITEMS.register("nequatium_ingot",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_NUGGET = ITEMS.register("nequatium_nugget",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_NEQUATIUM_DUST = ITEMS.register("raw_nequatium_dust",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_DUST = ITEMS.register("nequatium_dust",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_NEQUATIUM_CRYSTEL = ITEMS.register("raw_nequatium_crystel",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_CRYSTEL = ITEMS.register("nequatium_crystel",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_SHEET = ITEMS.register("nequatium_sheet",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_ROD = ITEMS.register("nequatium_rod",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIC_WATER_CELL = ITEMS.register("nequatic_water_cell",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIC_PUMP = ITEMS.register("nequatic_pump",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HEAVY_WATER_BUCKET = ITEMS.register("heavy_water_bucket",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ATUNED_NEQUATIUM_INGOT = ITEMS.register("atuned_nequatium_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static final DeferredItem<Item> ATUNED_NEQUATIUM_NUGGET = ITEMS.register("atuned_nequatium_nugget",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static final DeferredItem<Item>ATUNED_NEQUATIUM_DUST = ITEMS.register("atuned_nequatium_dust",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static final DeferredItem<Item> NETHER_STAR_DUST = ITEMS.register("nether_star_dust",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static final DeferredItem<Item> NETHER_STAR_COMPOUND = ITEMS.register("nether_star_compound",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static final DeferredItem<Item> ATUNED_NEQUATIUM_SHEET = ITEMS.register("atuned_nequatium_sheet",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static final DeferredItem<Item> ATUNED_NEQUATIUM_ROD = ITEMS.register("atuned_nequatium_rod",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static final DeferredItem<Item> ATUNED_NEQUATIC_WATER_CELL = ITEMS.register("atuned_nequatic_water_cell",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static final DeferredItem<Item> ATUNED_NEQUATIC_PUMP = ITEMS.register("atuned_nequatic_pump",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static final DeferredItem<Item> NETHERITE_DUST = ITEMS.register("netherite_dust",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_HALF_INGOT = ITEMS.register("nequatium_half_ingot",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_HELMIT = ITEMS.register("nequatium_helmit",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_BOOTS = ITEMS.register("nequatium_boots",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_PANTS = ITEMS.register("nequatium_pants",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NEQUATIUM_CHESTPLATE = ITEMS.register("nequatium_chestplate",
            ()-> new Item(new Item.Properties()));


    public static final DeferredItem<Item> ATUNED_NEQUATIUM_HALF_INGOT = ITEMS.register("atuned_nequatium_half_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)) {
                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }
            });

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
