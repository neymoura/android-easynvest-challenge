package com.ghost.easynvestchallenge

import com.ghost.easynvestchallenge.modules.simulation.network.SimulationNetwork
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.junit.Before
import org.junit.Test
import java.util.concurrent.CountDownLatch

class SimulationNetworkTest {

    @Before
    fun tearUp() {
        RxJavaPlugins.setIoSchedulerHandler { Schedulers.trampoline() }
        RxAndroidPlugins.setMainThreadSchedulerHandler { Schedulers.trampoline() }
    }

    @Test
    fun simulateRequest() {

        val signal = CountDownLatch(1)

        SimulationNetwork.simulate(1000.0,
                "CDI",
                123,
                false,
                "2023-03-03",
                {
                    assert(true)
                    signal.countDown()
                }, {
            assert(false)
            signal.countDown()
        })

        signal.await()

    }

}
