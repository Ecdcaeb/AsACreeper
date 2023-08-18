package com.Hileb.as_a_creeper_hileb.client;

import com.Hileb.as_a_creeper_hileb.core.ExtraRenderPlayerStatic;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @Project AsACreeper
 * @Author Hileb
 * @Date 2023/8/17 16:14
 *
 **/
/**{@link net.minecraft.client.renderer.entity.RenderCreeper#}**/
@Mixin(RenderPlayer.class)
public abstract class ExtraRenderPlayer extends RenderLivingBase<AbstractClientPlayer>{
    public ExtraRenderPlayer(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
        super(renderManagerIn, modelBaseIn, shadowSizeIn);
    }

    @Override
    public int getColorMultiplier(AbstractClientPlayer entitylivingbaseIn, float lightBrightness, float partialTickTime)
    {
        return ExtraRenderPlayerStatic.getColorMultiplier(entitylivingbaseIn,lightBrightness,partialTickTime);
    }

    public void preRenderCallback(AbstractClientPlayer entitylivingbaseIn, float partialTickTime)
    {
        ExtraRenderPlayerStatic.preRenderCallback((RenderPlayer)(Object)this,entitylivingbaseIn,partialTickTime);
    }
}
