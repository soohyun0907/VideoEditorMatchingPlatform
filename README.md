# 편집 

- 개발 기간 : 20.07.20 ~ 20.08.21
- Front-end : Vue.js
- Back-end : SpringRestful
- 6명이 한 팀으로 진행.
- 내가 맡은 역할 : 팀장 & 프론트, 백엔드 (프론트 엔드 개발 위주 - 특히, 포트폴리오페이지 프론트, 백 모두 개발)
- 프로젝트 소개 : 편집자와 편집자를 찾는 사람들 사이의 매칭 플랫폼
- 프로젝트 특장점
  - CF알고리즘을 통한 사용자 맞춤 편집자 추천
  - Redis를 이용하여 보다 빠른 검색결과 반환
  - 알람 페이지에 스케줄러 기능 제공
- [프로젝트에 대한 자세한 소개](https://github.com/soohyun0907/VideoEditorMatchingPlatform/blob/master/wiki/home.md)
- 화면 캡쳐 오른쪽 하단에 있는 화살표 표시는 원래는 한개이지만 캡쳐하면서 여러개가 캡쳐되었음.

## 메인페이지

### 로그인 전

![메인페이지_로그인전](https://user-images.githubusercontent.com/33771279/91785771-1a825580-ec41-11ea-9c6c-7cae49370047.png)

### 로그인 후

- CF알고리즘을 이용하여 추천 시스템 개발하였습니다.

![메인페이지_로그인후](https://user-images.githubusercontent.com/33771279/91785773-1b1aec00-ec41-11ea-9e1e-0f076c2a3987.png)

### 로그인 후_편집자 알림

- 요청된 작업이 있는 경우 빨간색으로 표시됩니다.

![메인페이지_편집자_알림](https://user-images.githubusercontent.com/33771279/91785775-1c4c1900-ec41-11ea-81a5-449424692c4c.png)

- 알림 아이콘을 누를 경우 간단하게 알림 요청을 확인할 수 있습니다.

![메인페이지_편집자_알림_상세보기](https://user-images.githubusercontent.com/33771279/91785778-1d7d4600-ec41-11ea-848e-9ffe956251da.png)

- 일반사용자의 경우도 편집자가 요청 수락시 알림을 확인할 수 있습니다.

![메인페이지_일반사용자_알림상세](https://user-images.githubusercontent.com/33771279/91785774-1bb38280-ec41-11ea-8483-40fa52f6c684.png)

## 검색페이지_전체보기

![검색_메인](https://user-images.githubusercontent.com/33771279/91785814-2706ae00-ec41-11ea-9d87-6b6560aa8324.png)

## 검색_Stepper를 통한 정보 검색

### Stepper

![Stepper1](https://user-images.githubusercontent.com/33771279/91785800-240bbd80-ec41-11ea-94d9-d56d8c332458.png)

![Stepper2](https://user-images.githubusercontent.com/33771279/91785801-240bbd80-ec41-11ea-9331-2a554585ddf0.png)

![Stepper3](https://user-images.githubusercontent.com/33771279/91785802-24a45400-ec41-11ea-91f2-abbe74e61272.png)

![Stepper3_선택시](https://user-images.githubusercontent.com/33771279/91785804-24a45400-ec41-11ea-8562-cf7c092d83ed.png)

![Stepper4](https://user-images.githubusercontent.com/33771279/91785807-253cea80-ec41-11ea-9575-cb5dc3ef5753.png)

![Stepper5](https://user-images.githubusercontent.com/33771279/91785810-25d58100-ec41-11ea-9707-f5b99dfb2735.png)

![Stepper6](https://user-images.githubusercontent.com/33771279/91785812-25d58100-ec41-11ea-8037-a01cb9979c79.png)

### Stepper를 통한 검색 페이지

- Stepper를 통해 조건을 입력하면 입력한 사항이 검색 페이지에 반영되어 편집자 리스트를 출력합니다.
- 편집자 리스트는 작업 이력을 통해 조건과 일치하는 편집자를 반환합니다.

![검색_AfterStepper](https://user-images.githubusercontent.com/33771279/91785813-266e1780-ec41-11ea-8516-f00f584077ee.png)

## 포트폴리오 페이지

- 일반사용자가 보게 되는 모습입니다.

![포트폴리오](https://user-images.githubusercontent.com/33771279/91785790-20783680-ec41-11ea-81c3-92ba554a0aa9.png)

- 편집자가 본인의 포트폴리오 페이지를 보는 경우 보게 되는 모습입니다.

![포트폴리오_편집자](https://user-images.githubusercontent.com/33771279/91785797-2241fa00-ec41-11ea-9041-404e45a98ba2.png)

## 포트폴리오 등록 및 수정

### 등록

![포트폴리오_최초등록시](https://user-images.githubusercontent.com/33771279/91785794-2241fa00-ec41-11ea-9460-7c76e0a4b686.png)

### 수정

![포트폴리오_수정페이지](https://user-images.githubusercontent.com/33771279/91785791-2110cd00-ec41-11ea-9835-4511822f5d0e.png)

## 요청서

- Stepper를 통한 검색 후 포트폴리오 페이지에서 요청하기 버튼을 누르면 아래와 같이 정보가 자동으로 입력되어 요청하기 버튼을 통해 편집을 요청할 수 있습니다.
- Stepper를 통하지 않고 리스트에서 포트폴리오로 들어온 후 요청하는 경우에는 사용자가 입력하여 요청하기 버튼을 통해 편집을 요청할 수 있습니다.

![요청서_Modal](https://user-images.githubusercontent.com/33771279/91785789-1f470980-ec41-11ea-879e-2e112b09534d.png)

## 알람 페이지

### 일반사용자

![알림_일반사용자](https://user-images.githubusercontent.com/33771279/91785785-1eae7300-ec41-11ea-8062-6678f63d975c.png)

### 편집자_요청 받은 작업 보기

![알림_편집자_편집자모드](https://user-images.githubusercontent.com/33771279/91785787-1f470980-ec41-11ea-8003-4692e578672d.png)

### 편집자_일반사용자 모드

![알림_편집자_일반사용자모드](https://user-images.githubusercontent.com/33771279/91785786-1eae7300-ec41-11ea-9163-2a21cfaf01cd.png)



## 북마크 리스트 페이지

![북마크](https://user-images.githubusercontent.com/33771279/91785781-1d7d4600-ec41-11ea-80c5-d89315849eed.png)

## 로그인

- 로그인은 구글 로그인과 일반 로그인을 지원합니다.

![로그인](https://user-images.githubusercontent.com/33771279/91785765-18b89200-ec41-11ea-9111-065dbe1a3dd0.png)

- 로그인 실패 시

![로그인_실패시](https://user-images.githubusercontent.com/33771279/91785769-19e9bf00-ec41-11ea-8f92-c8c1cf5eac0b.png)

## 회원가입

![회원가입](https://user-images.githubusercontent.com/33771279/91785799-23732700-ec41-11ea-936b-15916a6132ed.png)