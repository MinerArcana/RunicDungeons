package com.minerarcana.runicdungeons;


import com.minerarcana.runicdungeons.content.BlockRegistry;
import com.minerarcana.runicdungeons.content.DimensionRegistry;
import com.minerarcana.runicdungeons.content.StructureRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
;import static com.minerarcana.runicdungeons.RunicDungeons.MOD_ID;


@Mod(MOD_ID)
public class RunicDungeons
{
    public static final String MOD_ID = "runicdungeons";
    private static final Logger LOGGER = LogManager.getLogger();

    public RunicDungeons() {

        MinecraftForge.EVENT_BUS.register(this);
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.register(bus);
        StructureRegistry.register(bus);
        DimensionRegistry.register(bus);
    }


}
