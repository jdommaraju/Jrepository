var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "2",
        "ok": "2",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "277",
        "ok": "277",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1335",
        "ok": "1335",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "806",
        "ok": "806",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "529",
        "ok": "529",
        "ko": "-"
    },
    "percentiles1": {
        "total": "806",
        "ok": "806",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1071",
        "ok": "1071",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1282",
        "ok": "1282",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1324",
        "ok": "1324",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1,
    "percentage": 50
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1,
    "percentage": 50
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.333",
        "ok": "0.333",
        "ko": "-"
    }
},
contents: {
"req_verify-user-cre-dd078": {
        type: "REQUEST",
        name: "Verify User Credentials",
path: "Verify User Credentials",
pathFormatted: "req_verify-user-cre-dd078",
stats: {
    "name": "Verify User Credentials",
    "numberOfRequests": {
        "total": "1",
        "ok": "1",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "1335",
        "ok": "1335",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "1335",
        "ok": "1335",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "1335",
        "ok": "1335",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "percentiles1": {
        "total": "1335",
        "ok": "1335",
        "ko": "-"
    },
    "percentiles2": {
        "total": "1335",
        "ok": "1335",
        "ko": "-"
    },
    "percentiles3": {
        "total": "1335",
        "ok": "1335",
        "ko": "-"
    },
    "percentiles4": {
        "total": "1335",
        "ok": "1335",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 1,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.167",
        "ok": "0.167",
        "ko": "-"
    }
}
    },"req_verify-bearer-t-1f0ae": {
        type: "REQUEST",
        name: "Verify Bearer Token",
path: "Verify Bearer Token",
pathFormatted: "req_verify-bearer-t-1f0ae",
stats: {
    "name": "Verify Bearer Token",
    "numberOfRequests": {
        "total": "1",
        "ok": "1",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "277",
        "ok": "277",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "277",
        "ok": "277",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "277",
        "ok": "277",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "0",
        "ok": "0",
        "ko": "-"
    },
    "percentiles1": {
        "total": "277",
        "ok": "277",
        "ko": "-"
    },
    "percentiles2": {
        "total": "277",
        "ok": "277",
        "ko": "-"
    },
    "percentiles3": {
        "total": "277",
        "ok": "277",
        "ko": "-"
    },
    "percentiles4": {
        "total": "277",
        "ok": "277",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.167",
        "ok": "0.167",
        "ko": "-"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
