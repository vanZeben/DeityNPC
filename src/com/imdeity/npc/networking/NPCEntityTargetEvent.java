package com.imdeity.npc.networking;

import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityTargetEvent;

public class NPCEntityTargetEvent extends EntityTargetEvent {

	public static enum NpcTargetReason {
		CLOSEST_PLAYER, NPC_RIGHTCLICKED, NPC_BOUNCED
	}

	private NpcTargetReason reason;

	public NPCEntityTargetEvent(Entity entity, Entity target, NpcTargetReason reason) {
		super(entity, target, TargetReason.CUSTOM);
		this.reason = reason;
	}

	public NpcTargetReason getNpcReason() {
		return this.reason;
	}

}