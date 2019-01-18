package com.christiankula.daggerandroidinjectionsample.home.ui.sub.ui

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.christiankula.daggerandroidinjectionsample.R
import com.christiankula.daggerandroidinjectionsample.home.ui.sub.SubHomeHelloWorldService
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_sub_home.*
import javax.inject.Inject


class SubHomeFragment : Fragment() {

    @Inject
    lateinit var subHomeHelloWorldService: SubHomeHelloWorldService

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sub_home, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sayFragmentHello()
    }

    private fun sayFragmentHello() {
        subHelloWorld.text = subHomeHelloWorldService.getHelloWorld()
    }
}