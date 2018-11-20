package top.golabe.library

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class GoToast {
    companion object {
        private var mToast: Toast? = null
        private const val DEF_RES = -100
        fun success(ctx: Context, message: CharSequence, duration: Int = Toast.LENGTH_SHORT): GoToast {
            return create(
                ctx, message,
                Color.parseColor("#62a465"),
                Color.parseColor("#FFFFFF"),
                R.drawable.ic_success, duration = duration
            )
        }

        fun failed(ctx: Context, message: CharSequence, duration: Int = Toast.LENGTH_SHORT): GoToast {
            return create(
                ctx, message,
                Color.parseColor("#d92727"),
                Color.parseColor("#FFFFFF"),
                R.drawable.ic_failed, duration = duration
            )
        }

        @SuppressLint("ShowToast")
        fun create(
            ctx: Context,
            message: CharSequence,
            bgColor: Int = Color.parseColor("#292828"),
            textColor: Int = Color.parseColor("#FFFFFF"),
            leftResId: Int = DEF_RES,
            rightResId: Int = DEF_RES,
            duration: Int = Toast.LENGTH_SHORT
        ): GoToast {
            mToast = Toast.makeText(ctx, message, duration)
            val toast = GoToast()
            val inflate = ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val v = inflate.inflate(R.layout.toast_transient_notification, null) as View
            val layout = v.findViewById<View>(R.id.ll) as LinearLayout
            val leftIv = v.findViewById<View>(R.id.iv_left) as ImageView
            val rightIv = v.findViewById<View>(R.id.iv_right) as ImageView
            val messageTv = v.findViewById<View>(R.id.tv_msg) as TextView

            val gd = GradientDrawable()
            gd.setColor(bgColor)
            gd.cornerRadius = 40F.dp2px(ctx)
            layout.background = gd

            messageTv.setTextColor(textColor)
            messageTv.text = message

            if (leftResId != DEF_RES) {
                leftIv.visibility = View.VISIBLE
                leftIv.tint(ctx, leftResId, textColor)
            } else {
                leftIv.visibility = View.GONE
            }

            if (rightResId != DEF_RES) {
                rightIv.visibility = View.VISIBLE
                rightIv.tint(ctx, rightResId, textColor)

            } else {
                rightIv.visibility = View.GONE
            }

            mToast?.view = v
            return toast
        }
    }

    fun show() {
        mToast?.show()
    }


}
