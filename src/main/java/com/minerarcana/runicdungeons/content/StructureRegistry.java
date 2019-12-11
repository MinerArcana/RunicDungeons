package com.minerarcana.runicdungeons.content;

import com.minerarcana.runicdungeons.structures.RunicDungeonPiece;
import com.minerarcana.runicdungeons.structures.RunicDungeonStructure;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.minerarcana.runicdungeons.RunicDungeons.MOD_ID;

public class StructureRegistry {
    private static final DeferredRegister<Feature<?>> FEATURES = new DeferredRegister<>(ForgeRegistries.FEATURES, MOD_ID);

    public static final RegistryObject<Feature<?>> RUNIC_DUNGEON_STRUCTURE = FEATURES.register("runic_dungeon_structure", () -> new RunicDungeonStructure(NoFeatureConfig::deserialize));


    public static final IStructurePieceType RUNIC_DUNGEON_PIECE = register("runic_dungeon_piece", RunicDungeonPiece::new);

    private static IStructurePieceType register(String key, IStructurePieceType type) {
        return Registry.register(Registry.STRUCTURE_PIECE, new ResourceLocation(MOD_ID, key), type);
    }

    public static void register(IEventBus bus) {
        FEATURES.register(bus);
    }

}
