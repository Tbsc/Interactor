package tbsc.interactor.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tbsc.butter.api.ButterAPI;
import tbsc.interactor.Interactor;

/**
 * Common proxy. Everything that is called here will run on both sides.
 *
 * Created by tbsc on 05/07/2016.
 */
public class CommonProxy implements IProxy {

    /**
     * Mod construction game lifecycle stage.
     * Registers the mod to the ButterAPI loader.
     */
    @Override
    public void construction() {
        ButterAPI.registerModToButterLoader(Interactor.MODID);
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent fmlInitializationEvent) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent fmlPostInitializationEvent) {

    }

    @Override
    public void loadComplete(FMLLoadCompleteEvent event) {

    }

}
