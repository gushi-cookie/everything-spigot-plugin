package org.ultragore.everything.types;

public enum Modules {
	OP_REGIONS ("OPRegions", "opregions", org.ultragore.everything.modules.OPRegions.OPRegions.class),
	CHEST_COMMANDS_EXTENDER ("ChestCommandsExtender", "cce", org.ultragore.everything.modules.ChestCommandsExtender.ChestCommandsExtender.class),
	ANTI_CMD ("AntiCMD", "anticmd", org.ultragore.everything.modules.AntiCMD.AntiCMD.class),
	CASINO ("Casino", "casino", org.ultragore.everything.modules.Casino.Casino.class),
	WE_EXTENDER ("WEExtender", "wee", org.ultragore.everything.modules.WorldEditExtender.WorldEditExtender.class),
	TORCH ("Torch", "torch", org.ultragore.everything.modules.Torch.Torch.class),
	MINIGAMES_ADAPTER ("MinigamesAdapter", "mlobby", org.ultragore.everything.modules.MinigamesAdapter.MinigamesAdapter.class);
//	TAB_LIST ("TabList", null, org.ultragore.everything.modules.TabList.TabList.class);
	
	private String moduleName;
	private String moduleCommand;
	private Class moduleClass;
	
	public String getModuleName() {
		return moduleName;
	}
	public String getModuleCommand() {
		return moduleCommand;
	}
	public Class getModuleClass() {
		return moduleClass;
	}
	
//	public Modules getModulesByModule(Module module) {
//		for(Modules m: Modules.values()) {
//			if(m.moduleName.equals(module.getModuleName())) {
//				return m;
//			}
//		}
//		
//		return null;
//	}

	Modules(String moduleName, String moduleCommand, Class moduleClass) {
		this.moduleName = moduleName;
		this.moduleCommand = moduleCommand;
		this.moduleClass = moduleClass;
	}
}
