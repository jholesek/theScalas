case class myUser(
        name: String,
        email: String,
        groups: Set[myGroup]
      )
      {
              def addGroup(group: myGroup): myUser =
                      copy(groups = groups + group)
      }

