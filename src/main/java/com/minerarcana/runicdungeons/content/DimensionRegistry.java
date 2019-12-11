package com.minerarcana.runicdungeons.content;

import com.minerarcana.runicdungeons.dimension.DungeonWorldDimension;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.BiFunction;

import static com.minerarcana.runicdungeons.RunicDungeons.MOD_ID;

public class DimensionRegistry {

    private static final DeferredRegister<ModDimension> DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, MOD_ID);

    public static final RegistryObject<ModDimension> DUNGEON_WORLD = DIMENSIONS.register("dungeon_world", () -> new ModDimension() {
        @Override
        public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
            return DungeonWorldDimension::new;
        }
    });

    public static void register(IEventBus bus) {
        DIMENSIONS.register(bus);
    }
}
