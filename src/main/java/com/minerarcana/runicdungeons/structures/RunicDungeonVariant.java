package com.minerarcana.runicdungeons.structures;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.IStringSerializable;

import java.util.Locale;

import static com.minerarcana.runicdungeons.content.BlockRegistry.*;

public enum RunicDungeonVariant implements IStringSerializable {
    BASICRUNES(0, BASIC_WALL_RUNE.get(), BASIC_CEILING_RUNE.get(), BASIC_FLOOR_RUNE.get(),BASIC_PILLAR_RUNE.get(), BASIC_RUNIC_CHEST.get(),
            BASIC_SPAWNER_RUNE.get(), BASIC_DISPENSER_RUNE.get(), BASIC_RUNIC_PRESSUREPLATE.get(), BASIC_LOCK_RUNE.get(), BASIC_LIGHT_RUNE.get(), Blocks.WATER);

    private final int index;
    private final Block wallBlock;
    private final Block ceilingBlock;
    private final Block floorBlock;
    private final Block pillarBlock;
    private final Block chestBlock;
    private final Block spawnerBlock;
    private final Block trapBlock;
    private final Block pressurePlate;
    private final Block lockBlock;
    private final Block lightBlock;
    private final Block fluid;

    RunicDungeonVariant(int index, Block wallBlock, Block ceilingBlock, Block floorBlock, Block pillarBlock, Block chestBlock,
                        Block spawnerBlock, Block trapBlock, Block pressurePlate, Block lockBlock,Block lightBlock, Block fluid) {
        this.index = index;
        this.wallBlock = wallBlock;
        this.ceilingBlock = ceilingBlock;
        this.floorBlock = floorBlock;
        this.pillarBlock = pillarBlock;
        this.chestBlock = chestBlock;
        this.spawnerBlock = spawnerBlock;
        this.trapBlock = trapBlock;
        this.pressurePlate = pressurePlate;
        this.lockBlock = lockBlock;
        this.lightBlock = lightBlock;
        this.fluid = fluid;
    }

    public Block getWallBlock() {
        return this.wallBlock;
    }
    public Block getCeilingBlock() {
        return this.ceilingBlock;
    }
    public Block getFloorBlock() {
        return this.floorBlock;
    }
    public Block getPillarBlock() {
        return this.pillarBlock;
    }
    public Block getChestBlock() {
        return this.chestBlock;
    }
    public Block getSpawnerBlock() {
        return this.spawnerBlock;
    }
    public Block getTrapBlock() {
        return this.trapBlock;
    }
    public Block getKeyHoleBlock() {
        return this.lockBlock;
    }
    public Block getLightBlock() {
        return this.lightBlock;
    }
    public Block getPressurePlate() {
        return this.pressurePlate;
    }
    public Block getFluid() {
        return this.fluid;
    }

    @Override
    public String getName() {
        return this.toString().toLowerCase(Locale.US);
    }

    public int getIndex() {
        return this.index;
    }

    public static RunicDungeonVariant getVariantFromIndex(int index) {
        switch (index) {
            case 0:
                return BASICRUNES;
            default:
                throw new IllegalStateException("Unexpected variant: " + index);
        }
    }
}
