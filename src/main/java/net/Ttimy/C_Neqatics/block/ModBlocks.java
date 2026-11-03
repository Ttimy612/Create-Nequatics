package net.Ttimy.C_Neqatics.block;

import net.Ttimy.C_Neqatics.CNequatics;
import net.Ttimy.C_Neqatics.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CNequatics.MOD_ID);

public static final DeferredBlock<Block> NEQUATIUM_BLOCK = registerBlock("nequatium_block",
        ()-> new Block(BlockBehaviour.Properties.of()
                .strength(4f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.METAL)));

public static final DeferredBlock<Block> RAW_NEQUATIUM_BLOCK = registerBlock("raw_nequatium_block",
        ()-> new Block(BlockBehaviour.Properties.of()
                .strength(4f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE)));

    public static final DeferredBlock<Block> NEQUATIC_MECHINE_CORE = registerBlock("nequatic_mechine_core",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> NEQUATIUM_CASING = registerBlock("nequatium_casing",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> NEQUATIC_MECHINE_CASING = registerBlock("nequatic_mechine_casing",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> ROLLED_NEQUATIUM_SHEET = registerBlock("rolled_nequatium_sheet",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> NEQUATIUM_ROD_BUNDLE = registerBlock("nequatium_rod_bundle",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> ATUNED_NEQUATIUM_ROD_BUNDLE = registerBlock("atuned_nequatium_rod_bundle",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> ATUNED_ROLLED_NEQUATIUM_SHEET = registerBlock("atuned_rolled_nequatium_sheet",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> NEQUATIC_WAVE_GENERATOR = registerBlock("nequatic_wave_generator",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> ATUNED_NEQUATIUM_BLOCK = registerBlock("atuned_nequatium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> ROD_MILL = registerBlock("rod_mill",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)));

    private static <T extends Block>DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
