package com.minerarcana.runicdungeons.dimension;

import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;

import javax.annotation.Nonnull;

public class DungeonWorldChunkGenerator extends ChunkGenerator<GenerationSettings> {
    public DungeonWorldChunkGenerator(IWorld worldIn, BiomeProvider provider, GenerationSettings settingsIn) {
        super(worldIn, provider, settingsIn);
    }

    @Override
    public void generateSurface(@Nonnull IChunk chunk) {
        //This is a void world!
    }

    @Override
    public int getGroundHeight() {
        return this.world.getSeaLevel() + 1;
    }

    @Override
    public void makeBase(@Nonnull IWorld iWorld, @Nonnull IChunk iChunk) {
        //Chunks are created as players spawn and unlock rooms
    }


    @Override
    public int func_222529_a(int p_222529_1_, int p_222529_2_, Heightmap.Type p_222529_3_) {
        return 0;
    }

    @Override
    public boolean hasStructure(Biome biomeIn, @Nonnull Structure<? extends IFeatureConfig> structureIn) {
        return false;
    }
}