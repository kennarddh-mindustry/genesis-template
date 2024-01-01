package kennarddh.template.core

import arc.util.Log
import kennarddh.genesis.core.commons.AbstractPlugin

@SuppressWarnings("unused")
class GenesisTemplate : AbstractPlugin() {
    override fun init() {
        Log.info("[GenesisTemplate] Loaded")
    }
}