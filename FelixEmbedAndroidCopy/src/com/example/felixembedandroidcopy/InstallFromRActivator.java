package com.example.felixembedandroidcopy;

import java.io.InputStream;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import android.content.res.Resources;

public class InstallFromRActivator implements BundleActivator{

	private String fileRootPath="";
	private Resources res;
	
	public InstallFromRActivator(Resources res, String fileRootPath){
		this.res = res;
		this.fileRootPath = fileRootPath;
	}
	
	public void start(BundleContext arg0) throws Exception {
		
        // get from R and install to apps private files dir
		
		InputStream is = res.openRawResource(R.raw.bundlerepository);
        Bundle bundlebundlerepository = arg0.installBundle(fileRootPath+"/felix/bundle/bundlerepository.jar", is);
        
        is = res.openRawResource(R.raw.shell);
        Bundle bundleshell = arg0.installBundle(fileRootPath+"/felix/bundle/shell.jar", is);
        
        
        is = res.openRawResource(R.raw.ipojo);
        Bundle bundleipojo = arg0.installBundle(fileRootPath+"/felix/bundle/ipojo.jar", is);
        
        is = res.openRawResource(R.raw.ipojoannotations);
        Bundle bundleipojoannotations = arg0.installBundle(fileRootPath+"/felix/bundle/ipojoannotations.jar", is);
        
        is = res.openRawResource(R.raw.ipojoarch);
        Bundle bundleipojoarch = arg0.installBundle(fileRootPath+"/felix/bundle/ipojoarch.jar", is);
        
        is = res.openRawResource(R.raw.fileinstall130);
        Bundle bundlefileinstall130 = arg0.installBundle(fileRootPath+"/felix/bundle/fileinstall130.jar", is);
        
        is = res.openRawResource(R.raw.textbundle);
        Bundle bundletextbundle = arg0.installBundle(fileRootPath+"felix/bundle/textbundle.jar",is);
        
        is = res.openRawResource(R.raw.contextmonitor);
        Bundle bundlecontextmonitor = arg0.installBundle(fileRootPath+"felix/bundle/contextmonitor.jar",is);
        
        is = res.openRawResource(R.raw.adaptationmanager);
        Bundle bundleadaptationmanager =arg0.installBundle(fileRootPath+"felix/bundle/adaptationmanager",is);
        
        is = res.openRawResource(R.raw.adaptationreasoner);
        Bundle bundleadaptationreasoner =arg0.installBundle(fileRootPath+"felix/bundle/adaptationreasoner",is);
        
        is = res.openRawResource(R.raw.configcontroller);
        Bundle bundleconfigcontroller = arg0.installBundle(fileRootPath+"felix/bundle/configcontroller",is);
        
        
        bundleshell.start();
        bundlebundlerepository.start();
        bundleipojo.start();
        bundleipojoannotations.start();
        bundleipojoarch.start();
        bundlefileinstall130.start();
        bundletextbundle.start();
        bundleconfigcontroller.start();
        bundleadaptationmanager.start();
        bundleadaptationreasoner.start();    
        bundlecontextmonitor.start();
       
	}

	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
