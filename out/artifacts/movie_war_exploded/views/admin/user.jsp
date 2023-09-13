<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/1.8.1/flowbite.min.css" rel="stylesheet"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/1.8.1/flowbite.min.js"></script>
    <title>Quản lý người dùng</title>
</head>

<body>


<nav class="fixed top-0 z-30 w-full bg-white ml-64 border-gray-200 dark:bg-gray-800 dark:border-gray-700">
    <div class="px-3 py-3 lg:px-5 lg:pl-3">
        <div class="flex items-center justify-between">
            <div class="flex items-center justify-start">
                <button data-drawer-target="logo-sidebar" data-drawer-toggle="logo-sidebar"
                        aria-controls="logo-sidebar" type="button"
                        class="inline-flex items-center p-2 text-sm text-gray-500 rounded-lg sm:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600">
                    <span class="sr-only">Open sidebar</span>
                    <svg class="w-6 h-6" aria-hidden="true" fill="currentColor" viewBox="0 0 20 20"
                         xmlns="http://www.w3.org/2000/svg">
                        <path clip-rule="evenodd" fill-rule="evenodd"
                              d="M2 4.75A.75.75 0 012.75 4h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 4.75zm0 10.5a.75.75 0 01.75-.75h7.5a.75.75 0 010 1.5h-7.5a.75.75 0 01-.75-.75zM2 10a.75.75 0 01.75-.75h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 10z">
                        </path>
                    </svg>
                </button>
            </div>
            <div class="flex items-center">
                <div class="flex items-center ml-3">
                    <div>
                        <button type="button"
                                class="flex text-sm bg-gray-800 rounded-full focus:ring-4 focus:ring-gray-300 dark:focus:ring-gray-600"
                                aria-expanded="false" data-dropdown-toggle="dropdown-user">
                            <span class="sr-only">Open user menu</span>
                            <img class="w-8 h-8 rounded-full"
                                 src="https://flowbite.com/docs/images/people/profile-picture-5.jpg"
                                 alt="user photo">
                        </button>
                    </div>
                    <div class="z-50 hidden my-4 text-base list-none bg-white divide-y divide-gray-100 rounded shadow dark:bg-gray-700 dark:divide-gray-600"
                         id="dropdown-user">
                        <div class="px-4 py-3" role="none">
                            <p class="text-sm text-gray-900 dark:text-white" role="none">
                                Neil Sims
                            </p>
                            <p class="text-sm font-medium text-gray-900 truncate dark:text-gray-300" role="none">
                                neil.sims@flowbite.com
                            </p>
                        </div>
                        <ul class="py-1" role="none">
                            <li>
                                <a href="#"
                                   class="block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white"
                                   role="menuitem">Dashboard</a>
                            </li>
                            <li>
                                <a href="#"
                                   class="block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white"
                                   role="menuitem">Settings</a>
                            </li>
                            <li>
                                <a href="#"
                                   class="block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white"
                                   role="menuitem">Earnings</a>
                            </li>
                            <li>
                                <a href="#"
                                   class="block px-4 py-2 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-300 dark:hover:bg-gray-600 dark:hover:text-white"
                                   role="menuitem">Sign out</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</nav>

<aside id="logo-sidebar"
       class="fixed top-0 left-0 z-40 w-72 h-screen mt-8 transition-transform -translate-x-full bg-white border-gray-200 sm:translate-x-0 dark:bg-gray-800 dark:border-gray-700"
       aria-label="Sidebar">

    <div class="h-full px-3 pb-4 overflow-y-auto bg-white dark:bg-gray-800">
        <a href="#" class="flex ml-2 mb-8">
            <img src="logo.png" class="h-16 mr-3" alt="FlowBite Logo"/>
            <span
                    class="self-center text-xl font-semibold sm:text-2xl whitespace-nowrap dark:text-white">CINEMOUNT</span>
        </a>
        <ul class="space-y-2 font-medium">
            <li class="border-s-2 border-gray-900">
                <a href="#"
                   class="flex items-center ml-2 px-3 py-3  rounded-lg dark:text-white hover:bg-gray-300 dark:hover:bg-gray-700 group">
                    <svg class="w-5 h-5 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white"
                         aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="currentColor"
                         viewBox="0 0 22 21">
                        <path
                                d="M16.975 11H10V4.025a1 1 0 0 0-1.066-.998 8.5 8.5 0 1 0 9.039 9.039.999.999 0 0 0-1-1.066h.002Z"/>
                        <path
                                d="M12.5 0c-.157 0-.311.01-.565.027A1 1 0 0 0 11 1.02V10h8.975a1 1 0 0 0 1-.935c.013-.188.028-.374.028-.565A8.51 8.51 0 0 0 12.5 0Z"/>
                    </svg>
                    <span class="ml-3">Thống kê</span>
                </a>
            </li>
            <li>
                <a href="#"
                   class="flex items-center ml-2 px-3 py-3 text-gray-900 rounded-lg dark:text-white hover:bg-gray-300 dark:hover:bg-gray-700 group"
                   aria-controls="dropdown-example" data-collapse-toggle="dropdown-example">
                    <svg class="flex-shrink-0 w-5 h-5 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white"
                         aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="currentColor"
                         viewBox="0 0 18 18">
                        <path
                                d="M6.143 0H1.857A1.857 1.857 0 0 0 0 1.857v4.286C0 7.169.831 8 1.857 8h4.286A1.857 1.857 0 0 0 8 6.143V1.857A1.857 1.857 0 0 0 6.143 0Zm10 0h-4.286A1.857 1.857 0 0 0 10 1.857v4.286C10 7.169 10.831 8 11.857 8h4.286A1.857 1.857 0 0 0 18 6.143V1.857A1.857 1.857 0 0 0 16.143 0Zm-10 10H1.857A1.857 1.857 0 0 0 0 11.857v4.286C0 17.169.831 18 1.857 18h4.286A1.857 1.857 0 0 0 8 16.143v-4.286A1.857 1.857 0 0 0 6.143 10Zm10 0h-4.286A1.857 1.857 0 0 0 10 11.857v4.286c0 1.026.831 1.857 1.857 1.857h4.286A1.857 1.857 0 0 0 18 16.143v-4.286A1.857 1.857 0 0 0 16.143 10Z"/>
                    </svg>
                    <span class="flex-1 ml-3 whitespace-nowrap">Quản lý</span>
                </a>
                <ul id="dropdown-example" class="py-2 space-y-2">
                    <li>
                        <a href="#"
                           class="flex ml-2 items-center w-full px-4 py-3 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700">
                            <svg class="text-gray-500" width="24" height="24" viewBox="0 0 24 24" fill="none"
                                 xmlns="http://www.w3.org/2000/svg">
                                <path d="M21 18V7L18 9L12 10L5 9L3 7V18L9 11.5L13 15L16.5 13L19.5 17.5L21 18Z"
                                      fill="currentColor"/>
                                <path
                                        d="M3 17L6.03914 13.4543C7.24119 12.0519 7.84222 11.3507 8.58666 11.2437C8.82846 11.209 9.07458 11.2188 9.31284 11.2727C10.0464 11.4388 10.5896 12.1857 11.676 13.6794L11.9869 14.107C12.2379 14.4521 12.3633 14.6246 12.5031 14.7213C12.8185 14.9396 13.2311 14.9582 13.5649 14.7691C13.7128 14.6854 13.8533 14.5248 14.1342 14.2038V14.2038C14.7172 13.5374 15.0088 13.2043 15.3126 13.0352C15.9993 12.6532 16.846 12.7087 17.4769 13.177C17.7562 13.3842 18.0017 13.7526 18.4929 14.4893L20.5 17.5"
                                        stroke="currentColor" stroke-width="2"/>
                                <path d="M7 9.5V4.5M17 9.5V4.5" stroke="currentColor" stroke-width="2"
                                      stroke-linecap="round"/>
                                <path d="M3 17V7M21 7V17" stroke="currentColor" stroke-width="2"
                                      stroke-linecap="round"/>
                                <path
                                        d="M17.0198 4.50998C18.6218 4.86883 19.8353 5.38985 20.4812 5.99615C21.127 6.60244 21.1711 7.26189 20.6067 7.87715C20.0424 8.49242 18.8996 9.03091 17.347 9.41315C15.7944 9.79539 13.9143 10.0011 11.9842 10C10.054 9.99886 8.17609 9.79092 6.62756 9.40686C5.07902 9.0228 3.94192 8.48297 3.38408 7.86705C2.82624 7.25112 2.87721 6.59173 3.52947 5.9862C4.18173 5.38067 5.40073 4.86107 7.00654 4.50411"
                                        stroke="currentColor" stroke-width="2" stroke-linecap="round"/>
                                <path
                                        d="M21 17C21 17.7956 20.0518 18.5587 18.364 19.1213C16.6761 19.6839 14.3869 20 12 20C9.61305 20 7.32387 19.6839 5.63604 19.1213C3.94821 18.5587 3 17.7956 3 17"
                                        stroke="currentColor" stroke-width="2"/>
                            </svg>
                            <span class="ml-3">Phim</span></a>
                    </li>
                    <li>
                        <a href="#"
                           class="flex items-center w-full ml-2 px-4 py-3 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700">
                            <svg class="text-gray-500" width="24" height="24" viewBox="0 0 24 24" fill="none"
                                 xmlns="http://www.w3.org/2000/svg">
                                <path
                                        d="M2 9C2 7.11438 2 6.17157 2.58579 5.58579C3.17157 5 4.11438 5 6 5H18C19.8856 5 20.8284 5 21.4142 5.58579C22 6.17157 22 7.11438 22 9C22 9.4714 22 9.70711 21.8536 9.85355C21.7071 10 21.4714 10 21 10H3C2.5286 10 2.29289 10 2.14645 9.85355C2 9.70711 2 9.4714 2 9Z"
                                        fill="currentColor"/>
                                <path fill-rule="evenodd" clip-rule="evenodd"
                                      d="M2.58579 21.4142C2 20.8284 2 19.8856 2 18V13C2 12.5286 2 12.2929 2.14645 12.1464C2.29289 12 2.5286 12 3 12H21C21.4714 12 21.7071 12 21.8536 12.1464C22 12.2929 22 12.5286 22 13V18C22 19.8856 22 20.8284 21.4142 21.4142C20.8284 22 19.8856 22 18 22H6C4.11438 22 3.17157 22 2.58579 21.4142ZM8 16C7.44772 16 7 16.4477 7 17C7 17.5523 7.44772 18 8 18H16C16.5523 18 17 17.5523 17 17C17 16.4477 16.5523 16 16 16H8Z"
                                      fill="currentColor"/>
                                <path d="M7 3L7 6" stroke="currentColor" stroke-width="2" stroke-linecap="round"/>
                                <path d="M17 3L17 6" stroke="currentColor" stroke-width="2"
                                      stroke-linecap="round"/>
                            </svg>

                            <span class="ml-3">Xuất chiếu</span></a>
                    </li>
                    <li>
                        <a href="#"
                           class="flex bg-gray-800 shadow-md text-white items-center w-full ml-2 px-4 py-3 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700">
                            <svg class="text-gray-500" width="24" height="24" viewBox="0 0 24 24" fill="none"
                                 xmlns="http://www.w3.org/2000/svg">
                                <circle cx="12" cy="8" r="4" fill="currentColor"/>
                                <path
                                        d="M5.33788 17.3206C5.99897 14.5269 8.77173 13 11.6426 13H12.3574C15.2283 13 18.001 14.5269 18.6621 17.3206C18.79 17.8611 18.8917 18.4268 18.9489 19.0016C19.0036 19.5512 18.5523 20 18 20H6C5.44772 20 4.99642 19.5512 5.0511 19.0016C5.1083 18.4268 5.20997 17.8611 5.33788 17.3206Z"
                                        fill="currentColor"/>
                            </svg>
                            <span class="ml-3">Người dùng</span></a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</aside>

<div class="ml-72 pt-14">
    <section class="bg-gray-50 dark:bg-gray-900 p-3 sm:p-5 rounded-lg">
        <div class="mx-auto max-w-screen-xl">
            <!-- Start coding here -->
            <div class="bg-white dark:bg-gray-800 relative shadow-md sm:rounded-lg overflow-hidden">
                <div
                        class="flex flex-col md:flex-row items-center justify-between space-y-3 md:space-y-0 md:space-x-4 p-4">
                    <div class="w-full md:w-1/2">
                        <form class="flex items-center">
                            <label for="searchName" class="sr-only">Tìm kiếm</label>
                            <div class="relative w-full">
                                <div class="absolute inset-y-0 left-0 flex items-center pl-3 pointer-events-none">
                                    <svg aria-hidden="true" class="w-5 h-5 text-gray-500 dark:text-gray-400"
                                         fill="currentColor" viewbox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
                                        <path fill-rule="evenodd"
                                              d="M8 4a4 4 0 100 8 4 4 0 000-8zM2 8a6 6 0 1110.89 3.476l4.817 4.817a1 1 0 01-1.414 1.414l-4.816-4.816A6 6 0 012 8z"
                                              clip-rule="evenodd"/>
                                    </svg>
                                </div>
                                <input type="text" id="searchName"
                                       class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full pl-10 p-2 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                                       placeholder="Tìm kiếm" required="">
                            </div>
                        </form>
                    </div>
                    <div
                            class="w-full md:w-auto flex flex-col md:flex-row space-y-2 md:space-y-0 items-stretch md:items-center justify-end md:space-x-3 flex-shrink-0">
                        <%--                        <button type="button" id="defaultModalButton" data-modal-toggle="defaultModal"--%>
                        <%--                                class="flex items-center justify-center text-white bg-gray-700 hover:bg-gray-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-4 py-2 dark:bg-blue-600 dark:hover:bg-blue-700 focus:outline-none dark:focus:ring-blue-800">--%>
                        <%--                            <svg class="h-3.5 w-3.5 mr-2" fill="currentColor" viewbox="0 0 20 20"--%>
                        <%--                                 xmlns="http://www.w3.org/2000/svg" aria-hidden="true">--%>
                        <%--                                <path clip-rule="evenodd" fill-rule="evenodd"--%>
                        <%--                                      d="M10 3a1 1 0 011 1v5h5a1 1 0 110 2h-5v5a1 1 0 11-2 0v-5H4a1 1 0 110-2h5V4a1 1 0 011-1z"/>--%>
                        <%--                            </svg>--%>
                        <%--                            Thêm phim--%>
                        <%--                        </button>--%>
                        <div class="flex items-center space-x-3 w-full md:w-auto">
                            <button id="actionsDropdownButton" data-dropdown-toggle="actionsDropdown"
                                    class="w-full md:w-auto flex items-center justify-center py-2 px-4 text-sm font-medium text-gray-900 focus:outline-none bg-white rounded-lg border border-gray-200 hover:bg-gray-100 hover:text-blue-700 focus:z-10 focus:ring-4 focus:ring-gray-200 dark:focus:ring-gray-700 dark:bg-gray-800 dark:text-gray-400 dark:border-gray-600 dark:hover:text-white dark:hover:bg-gray-700"
                                    type="button">
                                <svg class="-ml-1 mr-1.5 w-5 h-5" fill="currentColor" viewbox="0 0 20 20"
                                     xmlns="http://www.w3.org/2000/svg" aria-hidden="true">
                                    <path clip-rule="evenodd" fill-rule="evenodd"
                                          d="M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z"/>
                                </svg>
                                Bộ lọc
                            </button>
                            <div id="actionsDropdown"
                                 class="hidden z-10 w-44 bg-white rounded divide-y divide-gray-100 shadow dark:bg-gray-700 dark:divide-gray-600">
                                <ul class="py-1 text-sm text-gray-700 dark:text-gray-200"
                                    aria-labelledby="actionsDropdownButton">
                                    <li>
                                        <a href="#"
                                           class="block py-2 px-4 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">
                                            Thành viên</a>
                                    </li>
                                    <li>
                                        <a href="#"
                                           class="block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white">Chưa
                                            tham gia</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="overflow-x-auto h-[550px]">
                    <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400">
                        <thead
                                class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                        <tr>
                            <th scope="col" class="px-4 py-3 pl-6">Tên</th>
                            <th scope="col" class="px-4 py-3">Tài khoản</th>
                            <th scope="col" class="px-4 py-3">Số điện thoại</th>
                            <th scope="col" class="px-4 py-3">Trạng thái</th>
                            <th scope="col" class="px-4 py-3">Doanh thu</th>
                            <th scope="col" class="px-4 py-3">Thành viên</th>
                            <th scope="col" class="px-4 py-3">
                                <span class="sr-only">Actions</span>
                            </th>
                        </tr>
                        </thead>
                        <tbody id="body">
                        <c:forEach var="user" items="${users}">
                            <tr class="border-b dark:border-gray-700">
                                <th scope="row"
                                    class="flex items-center space-x-4 px-4 py-3 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                                    <div class="overflow-hidden rounded-lg">
                                        <img src="${user.avatar}"
                                             alt="" class="h-12 rounded-full">
                                    </div>
                                    <div>
                                        <p class="">${user.firstName} ${user.lastName}</p>
                                        <p class="text-xs text-gray-500">${user.email}</p>
                                    </div>
                                </th>
                                <td class="px-4 py-3 text-sm font-medium">${user.userName}</td>
                                <td class="px-4 py-3 text-sm font-medium">${user.phone}</td>
                                <td class="px-4 py-3 text-sm font-medium">
                                    <div class="flex items-center space-x-3">
                                        <c:choose>
                                            <c:when test="${user.isActive()}">
                                                <div class="h-2 w-2 bg-green-500 rounded-full"></div>
                                                <span>Hoạt động</span>
                                            </c:when>
                                            <c:otherwise>
                                                <div class="h-2 w-2 bg-red-500 rounded-full"></div>
                                                <span>Không hoạt động</span>
                                            </c:otherwise>
                                        </c:choose>

                                    </div>
                                </td>
                                <td class="px-4 py-3 text-sm font-medium">$299.222</td>
                                <td class="px-4 py-3 text-sm font-medium">
                                    <c:choose>
                                        <c:when test="${user.isMember()}">
                                            <p>Có</p>
                                        </c:when>
                                        <c:otherwise>
                                            <p>Không</p>
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                                <td class="px-4 py-3">
                                    <button id="apple-imac-27-dropdown-button"
                                            data-dropdown-toggle="apple-imac-27-dropdown" data-dropdown-placement="left"
                                            class="inline-flex items-center p-0.5 text-sm font-medium text-center text-gray-500 hover:text-gray-800 rounded-lg focus:outline-none dark:text-gray-400 dark:hover:text-gray-100"
                                            type="button">
                                        <svg class="w-5 h-5" aria-hidden="true" fill="currentColor"
                                             viewbox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
                                            <path
                                                    d="M6 10a2 2 0 11-4 0 2 2 0 014 0zM12 10a2 2 0 11-4 0 2 2 0 014 0zM16 12a2 2 0 100-4 2 2 0 000 4z"/>
                                        </svg>
                                    </button>
                                    <div id="apple-imac-27-dropdown"
                                         class="hidden z-10 w-44 bg-white rounded divide-y divide-gray-100 shadow dark:bg-gray-700 dark:divide-gray-600">
                                        <ul class="py-1 text-sm text-gray-700 dark:text-gray-200"
                                            aria-labelledby="apple-imac-27-dropdown-button">
                                            <li>
                                                <a href="#"
                                                   class="block py-2 px-4 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Sửa</a>
                                            </li>
                                            <li>
                                                <a href="#"
                                                   class="block py-2 px-4 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Xóa</a>
                                            </li>
                                        </ul>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <nav class="flex flex-col md:flex-row justify-between items-start md:items-center space-y-3 md:space-y-0 p-4"
                     aria-label="Table navigation">
                        <span class="text-sm font-normal text-gray-500 dark:text-gray-400">
                            Hiển thị
                            <span class="font-semibold text-gray-900 dark:text-white">${page.itemStart}-${page.itemStart+page.pageSize}</span>
                            of
                            <span class="font-semibold text-gray-900 dark:text-white">${page.sizeList}</span>
                        </span>
                    <ul class="inline-flex items-stretch -space-x-px">
                        <li>
                            <%--                            <a href="#"--%>
                            <%--                               class="flex items-center justify-center h-full py-1.5 px-3 ml-0 text-gray-500 bg-white rounded-l-lg border border-gray-300 hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white">--%>
                            <%--                                <span class="sr-only">Previous</span>--%>
                            <%--                                <svg class="w-5 h-5" aria-hidden="true" fill="currentColor" viewbox="0 0 20 20"--%>
                            <%--                                     xmlns="http://www.w3.org/2000/svg">--%>
                            <%--                                    <path fill-rule="evenodd"--%>
                            <%--                                          d="M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z"--%>
                            <%--                                          clip-rule="evenodd"/>--%>
                            <%--                                </svg>--%>
                            <%--                            </a>--%>
                        </li>
                        <c:forEach var="i" begin="1" end="${page.pageCount}">
                            <li>
                                <a href="/movie/admin/user/${i}"
                                   class="flex items-center justify-center text-sm py-2 px-3 leading-tight text-gray-500 bg-white border border-gray-300 hover:bg-gray-100 hover:text-gray-700 dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400 dark:hover:bg-gray-700 dark:hover:text-white">${i}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </nav>
            </div>
        </div>
    </section>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            $("#searchName").on("keyup", function () {
                var name = $(this).val();
                $.ajax({
                    type: "GET",
                    url: "/movie/admin/user/search",
                    data: {name: name},
                    success: function (response) {
                        var row = document.getElementById("body")
                        row.innerHTML = response;
                    }
                });
            });
        });
    </script>
</div>


</body>

</html>