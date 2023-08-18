package com.Hileb.as_a_creeper_hileb.client;

import com.Hileb.as_a_creeper_hileb.core.ExtraRenderPlayerStatic;
import com.Hileb.as_a_creeper_hileb.item.ItemSkullBoom;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerCreeperCharge;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

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
    protected int getColorMultiplier(AbstractClientPlayer entitylivingbaseIn, float lightBrightness, float partialTickTime)
    {
        return ExtraRenderPlayerStatic.getColorMultiplier(entitylivingbaseIn,lightBrightness,partialTickTime);
    }

    protected void preRenderCallback(AbstractClientPlayer entitylivingbaseIn, float partialTickTime)
    {
        ExtraRenderPlayerStatic.preRenderCallback((RenderPlayer)(Object)this,entitylivingbaseIn,partialTickTime);
    }
}
