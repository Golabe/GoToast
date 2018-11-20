package top.golabe.library

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.widget.ImageView


fun  Float.dp2px(ctx:Context) :Float{
    return (ctx.resources.displayMetrics.density*this+0.5F)
}

fun  ImageView.tint(ctx: Context,resId:Int,color:Int){
    val up = ContextCompat.getDrawable(ctx, resId)
    val drawableUp = DrawableCompat.wrap(up!!)
    DrawableCompat.setTint(drawableUp, color)
    this.setImageDrawable(drawableUp)
}