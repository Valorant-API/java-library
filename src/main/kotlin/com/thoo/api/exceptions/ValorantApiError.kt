package com.thoo.api.exceptions

import java.lang.Exception

class ValorantApiError(
    status: Int?,
    error: String
): Exception("$error ${if(status != null) "(${status})" else ""}")