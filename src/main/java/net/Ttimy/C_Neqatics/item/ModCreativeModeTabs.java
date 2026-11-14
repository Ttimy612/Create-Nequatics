package net.Ttimy.C_Neqatics.item;

import net.Ttimy.C_Neqatics.CNequatics;
import net.Ttimy.C_Neqatics.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CNequatics.MOD_ID);

    public static final Supplier<CreativeModeTab> NEQUATICS_ITEMS_TAB = CREATIVE_MODE_TAB.register("nequatics_items_tab",
            () -> CreativeModeTab.builder()
                    .withTabsAfter(ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(CNequatics.MOD_ID, "nequatics_blocks_tab")))
                    .icon(() -> new ItemStack(ModItems.NEQUATIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.cnequatics.nequatic_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RAW_NEQUATIUM.get());
                        output.accept(ModItems.NEQUATIUM_INGOT.get());
                        output.accept(ModItems.NEQUATIUM_NUGGET.get());
                        output.accept(ModItems.RAW_NEQUATIUM_DUST.get());
                        output.accept(ModItems.RAW_NEQUATIUM_CRYSTEL.get());
                        output.accept(ModItems.NEQUATIUM_CRYSTEL.get());
                        output.accept(ModItems.NEQUATIUM_DUST.get());
                        output.accept(ModItems.NEQUATIUM_SHEET.get());
                        output.accept(ModItems.NEQUATIUM_ROD.get());
                        output.accept(ModItems.ATUNED_NEQUATIUM_INGOT.get());
                        output.accept(ModItems.ATUNED_NEQUATIUM_NUGGET.get());
                        output.accept(ModItems.ATUNED_NEQUATIUM_DUST.get());
                        output.accept(ModItems.NEQUATIC_WATER_CELL.get());
                        output.accept(ModItems.ATUNED_NEQUATIC_WATER_CELL.get());
                        output.accept(ModItems.NEQUATIC_PUMP.get());
                        output.accept(ModItems.ATUNED_NEQUATIC_PUMP.get());
                        output.accept(ModItems.HEAVY_WATER_BUCKET.get());
                        output.accept(ModItems.NETHER_STAR_DUST.get());
                        output.accept(ModItems.NETHER_STAR_COMPOUND.get());
                        output.accept(ModItems.NETHERITE_DUST.get());
                        output.accept(ModItems.DIAMOND_DUST.get());
                        output.accept(ModItems.NEQUATIUM_HALF_INGOT.get());
                        output.accept(ModItems.ATUNED_NEQUATIUM_HALF_INGOT.get());
                        output.accept(ModItems.ATUNED_NEQUATIUM_SHEET.get());
                        output.accept(ModItems.ATUNED_NEQUATIUM_ROD.get());
                    })
                    .build());

    public static final Supplier<CreativeModeTab> NEQUATICS_BLOCKS_TAB = CREATIVE_MODE_TAB.register("nequatics_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.NEQUATIC_MECHINE_CORE.get()))

                    .title(Component.translatable("creativetab.cnequatics.nequatic_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RAW_NEQUATIUM_BLOCK.get());
                        output.accept(ModBlocks.NEQUATIUM_BLOCK.get());
                        output.accept(ModBlocks.NEQUATIC_MECHINE_CORE.get());
                        output.accept(ModBlocks.NEQUATIC_MECHINE_CASING.get());
                        output.accept(ModBlocks.NEQUATIUM_CASING.get());
                        output.accept(ModBlocks.ROLLED_NEQUATIUM_SHEET.get());
                        output.accept(ModBlocks.NEQUATIUM_ROD_BUNDLE.get());
                        output.accept(ModBlocks.ATUNED_NEQUATIUM_ROD_BUNDLE.get());
                        output.accept(ModBlocks.ATUNED_ROLLED_NEQUATIUM_SHEET.get());
                        output.accept(ModBlocks.ATUNED_NEQUATIUM_BLOCK.get());
                        output.accept(ModBlocks.NEQUATIC_WAVE_GENERATOR.get());



                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
