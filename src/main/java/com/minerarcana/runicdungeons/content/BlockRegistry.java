package com.minerarcana.runicdungeons.content;

import com.minerarcana.runicdungeons.blocks.*;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.minerarcana.runicdungeons.RunicDungeons.MOD_ID;
import static net.minecraft.block.material.Material.ROCK;

public class BlockRegistry {

    private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MOD_ID);
    private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);


    // Portal Runes

    public static final RegistryObject<Block> AR_RUNICSTONE = BLOCKS.register("ar_runicstone", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));
    public static final RegistryObject<Block> DHA_RUNICSTONE = BLOCKS.register("dha_runicstone", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));
    public static final RegistryObject<Block> GA_RUNICSTONE = BLOCKS.register("ga_runicstone", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));
    public static final RegistryObject<Block> GU_RUNICSTONE = BLOCKS.register("gu_runicstone", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));
    public static final RegistryObject<Block> RA_RUNICSTONE = BLOCKS.register("ra_runicstone", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));

    //Unbreakable Wall/Floor/Ceiling Runes

    public static final RegistryObject<Block> BASIC_WALL_RUNE = BLOCKS.register("basic_wall_rune", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));
    public static final RegistryObject<Block> BASIC_RUNE = BLOCKS.register("basic_rune", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));
    public static final RegistryObject<Block> BASIC_FLOOR_RUNE = BLOCKS.register("basic_floor_rune", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));
    public static final RegistryObject<Block> BASIC_CEILING_RUNE = BLOCKS.register("basic_ceiling_rune", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));

    //Pillar Runes

    public static final RegistryObject<Block> BASIC_PILLAR_RUNE = BLOCKS.register("basic_pillar_rune", () -> new Block(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .noDrops()
            .lightValue(10)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));

    //ChestBlocks

    public static final RegistryObject<Block> BASIC_RUNIC_CHEST = BLOCKS.register("basic_runic_chest", () -> new BasicRunicChest(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.PICKAXE)
            .hardnessAndResistance(100.0F, 100.0F)
    ));

    //Dispenser Runes
    public static final RegistryObject<Block> BASIC_DISPENSER_RUNE = BLOCKS.register("basic_dispenser_rune", () -> new BasicDispenserRune(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.AXE)
            .noDrops()
            .hardnessAndResistance(100.0F, 100.0F)
    ));

    //PressurePlates
    public static final RegistryObject<Block> BASIC_RUNIC_PRESSUREPLATE = BLOCKS.register("basic_runic_pressureplate", () -> new BasicRunicPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.AXE)
            .noDrops()
            .hardnessAndResistance(100.0F, 100.0F)
    ));

    //Lock Runes
    public static final RegistryObject<Block> BASIC_LOCK_RUNE = BLOCKS.register("basic_lock_rune", () -> new BasicLockRune(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.AXE)
            .noDrops()
            .hardnessAndResistance(100.0F, 100.0F)
    ));

    //Light Runes
    public static final RegistryObject<Block> BASIC_LIGHT_RUNE = BLOCKS.register("basic_light_rune", () -> new BasicLockRune(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.AXE)
            .noDrops()
            .hardnessAndResistance(100.0F, 100.0F)
    ));

    //Light Runes
    public static final RegistryObject<Block> BASIC_SPAWNER_RUNE = BLOCKS.register("basic_spawner_rune", () -> new BasicSpawnerRune(Block.Properties.create(ROCK)
            .harvestLevel(5)
            .sound(SoundType.STONE)
            .harvestTool(ToolType.AXE)
            .noDrops()
            .hardnessAndResistance(100.0F, 100.0F)
    ));


    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

}
