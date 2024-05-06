package com.example.memoryleaktest.controller

import com.example.memoryleaktest.domain.NonStaticStudent
import com.example.memoryleaktest.domain.StaticStudent
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StaticMemoryLeakTestController {
    @GetMapping("/makeStaticStudent")
    fun makeStaticStudent(): StaticStudent {
        return StaticStudent.init(name = "John Doe", age = 20)
    }

    @GetMapping("/makeNonStaticStudent")
    fun makeNonStaticStudent(): NonStaticStudent {
        val bio = """
                안녕하세요, 저는 현재 OOO 대학교의 OOO 학과에 재학 중인 OOO입니다.
                학교 생활을 통해 전공 지식뿐만 아니라 다양한 실무 경험을 쌓고 있습니다.
                특히, OOO 관련 분야에 큰 관심을 가지고 있으며, 이를 바탕으로 여러 학술 대회와 프로젝트에 참여해 우수한 성과를 거두었습니다.
                또한, 동아리 활동과 봉사 활동에도 열심히 참여하면서 사회적 책임과 리더십 능력을 키워나가고 있습니다.
                앞으로도 전문성을 갖춘 OOO이 되기 위해 끊임없이 노력할 것입니다. 감사합니다.
            """

        return NonStaticStudent(name = "John Doe", age = 20, bio = bio)
    }
}