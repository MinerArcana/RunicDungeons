package com.minerarcana.runicdungeons.structures;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.ScatteredStructure;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.function.Function;

import static com.minerarcana.runicdungeons.RunicDungeons.MOD_ID;

public class RunicDungeonStructure extends ScatteredStructure<NoFeatureConfig> {

    public RunicDungeonStructure(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51449_1_) {
        super(p_i51449_1_);
    }

    @Override
    protected int getSeedModifier() {
        return 14357800;
    }

    @Override
    public IStartFactory getStartFactory() {
        return RunicDungeonStructure.Start::new;
    }

    @Override
    public String getStructureName() {
        return MOD_ID + ":runic_dungeon_structure";
    }

    @Override
    public int getSize() {
        return 16;
    }

    public static class Start extends StructureStart {

        public Start(Structure<?> structureIn, int p_i50515_2_, int p_i50515_3_, Biome p_i50515_4_, MutableBoundingBox p_i50515_5_, int p_i50515_6_, long p_i50515_7_) {
            super(structureIn, p_i50515_2_, p_i50515_3_, p_i50515_4_, p_i50515_5_, p_i50515_6_, p_i50515_7_);
        }

        @Override
        public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn) {

            RunicDungeonPiece runicDungeonPiece;
            runicDungeonPiece = new RunicDungeonPiece(templateManagerIn, variant, "dirtisland", new BlockPos(x, y, z), rotation);
            this.components.add(runicDungeonPiece);
            this.recalculateStructureSize();
        }
    }
}
