package caseofgames.extreme_machines.common;

import caseofgames.extreme_machines.common.util.IReference;
import mcmultipart.api.addon.IMCMPAddon;
import mcmultipart.api.addon.MCMPAddon;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@MCMPAddon
@Mod(modid = IReference.MODID, name = IReference.NAME, version = IReference.VERSION)
public class Main implements IMCMPAddon {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = IReference.CLIENT, serverSide = IReference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
}
