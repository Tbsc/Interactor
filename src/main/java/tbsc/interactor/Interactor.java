package tbsc.interactor;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import tbsc.interactor.proxy.IProxy;

@Mod(modid = Interactor.MODID, version = Interactor.VERSION)
public class Interactor {

    public static final String MODID = "Interactor";
    public static final String VERSION = "0.0.1.0";

    @SidedProxy(clientSide = "tbsc.interactor.proxy.ClientProxy", serverSide = "tbsc.interactor.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.Instance
    public static Interactor instance;

    @EventHandler
    public void construction(FMLConstructionEvent event) {
        proxy.construction();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

}
