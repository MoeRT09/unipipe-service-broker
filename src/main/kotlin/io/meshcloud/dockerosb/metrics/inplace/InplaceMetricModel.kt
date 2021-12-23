package io.meshcloud.dockerosb.metrics.inplace

import java.math.BigDecimal
import java.time.Instant

data class InplaceMetricModel(
    val writtenAt: Instant,
    val observedAt: Instant,
    val value: BigDecimal
)