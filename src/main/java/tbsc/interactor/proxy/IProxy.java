package tbsc.interactor.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tbsc.butter.api.IInitiable;

/**
 * Proxy interface, used to define methods for proxy.
 *
 * Created by tbsc on 05/07/2016.
 */
public interface IProxy extends IInitiable<FMLPreInitializationEvent, FMLInitializationEvent, FMLPostInitializationEvent, FMLLoadCompleteEvent> {

    /**
     * Mod construction lifecycle stage.
     */
    void construction();

}
