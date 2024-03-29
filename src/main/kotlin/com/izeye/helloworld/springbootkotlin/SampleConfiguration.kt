package com.izeye.helloworld.springbootkotlin

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Sample [Configuration].
 *
 * @author Johnny Lim
 */
@Configuration
class SampleConfiguration {

    // This function name will be translated to 'sampleBean$hello_spring_boot_kotlin'.
    @Bean
    internal fun sampleBean() = SampleBean()

    @Bean
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("anotherSampleBean")
    internal fun anotherSampleBean() = SampleBean()

}

/**
 * Sample bean.
 *
 * @author Johnny Lim
 */
class SampleBean
