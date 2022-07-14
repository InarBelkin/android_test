package com.sirius.test_app

class DataModel(
    val image: String = "https://i.ibb.co/g3YVWD2/img-background.png",
    val logo: String = "https://s3-alpha-sig.figma.com/img/cf52/a010/d2d8badd19c3de46d88b8a74f80aaef6?Expires=1658707200&Signature=Psses5MeGRb1sB8Pvw8cJRB3u3ArbS2emgK0lHQLf80gRqAm7Pay5N-6GFlJ5QPw3y-9zcf65GK6ttmK4W-aubV1jN5fLnsdlpm7nwyOgsj30oizJVlSDy90TML26VyY~9eJrcKoz2m2x2hOJDq5imFTAtFOXWIZTdXHmgErNu6RkDqr-Nn-NoPD5GGgbY-sWHYGGINj3dnATsXlxOK5WTPTopJTD65bgcp1xvY2D-hM2pU57U7dtEN6uAGqXBqDjcMKDFMveceSS7tBx~gIvkBlgBViYn2y6ESca0ehkNupFZzn7ieWTSOUYAfNQ7EcKww60XBn5YvF9xOPcjzk4g__&Key-Pair-Id=APKAINTVSUGEWH5XD5UA",
    val name: String = "DoTA 2",
    val rating: Float = 4.9f,
    val gradeCnt: String = "70M",
    val tags: List<String> = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
    val videos: List<VideoModel> = listOf(
        VideoModel(id = "video_1", image = "https://ibb.co/q7dyBVH"),
        VideoModel(id = "video_2", image = "https://ibb.co/S3GymhJ")
    ),
    val description: String = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
    val reviews: List<ReviewModel> = listOf(
        ReviewModel(
            userImage = "https://i.ibb.co/55HSwqy/img-user-1.png",
            userName = "Auguste Conte",
            date = "February 14, 2019",
            message = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        ),
        ReviewModel(
            userImage = "https://i.ibb.co/j8t3zGZ/img-user-2.png",
            userName = "Jang Marcelino",
            date = "February 14, 2019",
            message =
            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    ),
    val action: ActionModel = ActionModel(
        name = "Install",
        action = "action_install"
    )

)

class ReviewModel(
    val userImage: String,
    val userName: String,
    val date: String,
    val message: String
)

class VideoModel(
    val id: String,
    val image: String
)

class ActionModel(
    val name: String,
    val action: String
)