package com.fire.myreivces.algorithm

import android.util.Log
import androidx.databinding.ViewDataBinding
import com.fire.myreivces.R
import com.fire.myreivces.base.BaseVMActivity
import kotlin.reflect.KClass

/***
 *算法复习
 * */
class ALGActivity : BaseVMActivity<ALGVM, ViewDataBinding >() {

  override fun setContentViews(): Int = R.layout.alg_activity
  override fun vmclazz(): KClass<ALGVM> = ALGVM::class

  override fun initView() {
    super.initView()

    Log.e("+++", "嘿嘿是是是")


    handler.postDelayed(Runnable {
      Log.e("++++", "演示延时实践")
    }, 2000)
  }

}