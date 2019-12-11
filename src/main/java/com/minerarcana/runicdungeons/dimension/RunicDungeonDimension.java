package com.minerarcana.runicdungeons.dimension;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.function.BiFunction;

import static com.minerarcana.runicdungeons.RunicDungeons.MOD_ID;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RunicDungeonDimension {

    public static final ResourceLocation DUNGEONWORLD = new ResourceLocation(MOD_ID + ":dungeon_world");
    public static ModDimension DUNGEON_WORLD = new ModDimension() {
        @Override
        public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
            return DungeonWorldDimension::new;
        }
    }.setRegistryName(DUNGEONWORLD);

    public static ChunkGeneratorType<GenerationSettings, DungeonWorldChunkGenerator> generatorType = new ChunkGeneratorType<>(DungeonWorldChunkGenerator::new, false, GenerationSettings::new);

    public static BiomeProviderType<SingleBiomeProviderSettings, DungeonWorldBiomeProvider> biomeProviderType = new BiomeProviderType<>(DungeonWorldBiomeProvider::new, SingleBiomeProviderSettings::new);

    @SubscribeEvent
    public static void onDimensionModRegistry(final RegistryEvent.Register<ModDimension> event) {
        event.getRegistry().register(DUNGEON_WORLD);
        DimensionManager.registerDimension(DUNGEONWORLD , DUNGEON_WORLD, null, false);
    }
}
